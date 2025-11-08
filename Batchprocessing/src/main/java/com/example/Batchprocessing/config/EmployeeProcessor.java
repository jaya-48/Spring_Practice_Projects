package com.example.Batchprocessing.config;

//import com.example.Batchprocessing.model.Employee;
import com.example.Batchprocessing.model.EmployeeDetails;
import org.springframework.batch.item.ItemProcessor;

import javax.print.attribute.standard.MediaSize;

public class EmployeeProcessor implements ItemProcessor<EmployeeDetails,EmployeeDetails> {


    @Override
    public EmployeeDetails process(EmployeeDetails item) throws Exception {
        return item;
    }

}
