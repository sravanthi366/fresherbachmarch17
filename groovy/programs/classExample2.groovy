class Car{

    String name
    int model
    String color

    def getCarDetails(){

        println "You are driving a car has $model model and color is $color and name is $name"
    }

    def startEngine(){
        println "$name engine has started"
    }
    static main(args) {
        Car c1 = new Car()
        c1.name = "Shift Dezire"
        c1.model = 2022
        c1.color = "Premium Silver"

        c1.getCarDetails()
        c1.startEngine()
    }
}