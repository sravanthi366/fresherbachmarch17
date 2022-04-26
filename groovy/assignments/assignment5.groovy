// Sorting a list 
// Create a class called course with a string atrribute called name and an int attribute called days create alist of four course instances where at least two have the same number of days sort the list by number of days. Then sort the list by days but when days are equal sort by name 

class Course{
    Stringgit  name;
    int days;
    def courseDetails(){

        println "Course name is $name and durtaion is $days days."


    }

            static main(args) {
            Course obj = new Course()
            obj.name = ["java","python","groovy","devops"]
            obj.days = [30,30,20,90]

            obj.courseDetails()
        }
}