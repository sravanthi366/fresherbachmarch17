class Fruits {
    String Name
    String Color
    def setName(String name){

        Name = name

    }
    def setColor(String color){
        Color = color
    }

    def getName(){
        println "Name of the fruit is $Name"
    }
    def getColor(){
        println "Color of the fruit is $Color"
    }

    static main(args) {

        Fruits apple = new Fruits()

        apple.setName("Apple")
        apple.setColor("Red")

        apple.getName()
        apple.getColor()
        
    }
}
