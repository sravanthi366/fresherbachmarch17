class Student{

    String name

    int sub1Marks
    int sub2Marks

    def Total(){

        println("$name has total marks of: "+(sub1Marks+sub2Marks))
    }


    static main(args) {
        Student s1 = new Student()

        s1.name = "Sravanthi"
        s1.sub1Marks = 89
        s1.sub2Marks = 90

        s1.Total()
    }
}