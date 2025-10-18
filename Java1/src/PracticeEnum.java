public enum PracticeEnum{
    PASS(50),FAIL(40),NR;
    private int marks;

    PracticeEnum() {
        System.out.println("no param");
    }

    PracticeEnum(int marks) {
        this.marks = marks;
        System.out.println("param");
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
}