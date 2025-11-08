package com.example.Batchprocessing.config;

import com.example.Batchprocessing.dao.EmployeeRepo;
//import com.example.Batchprocessing.model.Employee;
import com.example.Batchprocessing.model.EmployeeDetails;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.batch.item.data.RepositoryItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
public class BatchConfig {
    @Autowired
    private EmployeeRepo repo;

    @Autowired
    private JobRepository jobRepo;
    @Autowired
    private PlatformTransactionManager transcationManager;

    //ItemReader
    @Bean
    public FlatFileItemReader<EmployeeDetails> itemReader(){
        FlatFileItemReader<EmployeeDetails> reader=new FlatFileItemReader<>();
        reader.setResource(new FileSystemResource("src/main/resources/employees_1000.csv"));
        reader.setName("Bulk-CSV");
        reader.setLinesToSkip(1);
        reader.setLineMapper(lineMapper());
        return reader;
    }

    private LineMapper<EmployeeDetails> lineMapper() {
        DefaultLineMapper<EmployeeDetails>mapper=new DefaultLineMapper<>();
        DelimitedLineTokenizer tokenizer = new DelimitedLineTokenizer();
        tokenizer.setDelimiter(",");
        tokenizer.setStrict(false);
        tokenizer.setNames("id","firstname","lastname","email","salary","department");
        BeanWrapperFieldSetMapper<EmployeeDetails> Beanwrapper = new BeanWrapperFieldSetMapper<>();
        Beanwrapper.setTargetType(EmployeeDetails.class);
        mapper.setLineTokenizer(tokenizer);
        mapper.setFieldSetMapper(Beanwrapper);
        return mapper;
    }


    //ItemProcessor
    @Bean
    public EmployeeProcessor itemProcessor(){
        return new EmployeeProcessor();
    }



    //ItemWriter
    public RepositoryItemWriter<EmployeeDetails> itemWriter(){
        RepositoryItemWriter<EmployeeDetails> writer=new RepositoryItemWriter<>();
        writer.setRepository(repo);
        writer.setMethodName("save");
        return writer;
    }

    //Step
    public Step step(){

        return new StepBuilder("step-1",jobRepo).<EmployeeDetails,EmployeeDetails>
                chunk(10,transcationManager)
                .reader(itemReader())
                .processor(itemProcessor())
                .writer(itemWriter())
                .build();
    }


    //Job
    @Bean
    public Job job(){
        return new JobBuilder("Employees-job",jobRepo).start(step()).build();
    }
}
