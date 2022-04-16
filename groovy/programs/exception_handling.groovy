// try-catch
// try-catch-finally
// try-finally
try{
int i = 1/0
}catch(Exception exp){
    println "i am inside the exception block"
    println exp.getCause()
    println exp.getMessage()
    //exp.printStackTrace()
}finally{
    println "I am inside finally block"
}

println "Anthoer set of code"

