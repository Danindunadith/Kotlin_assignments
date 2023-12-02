fun main(){

    generateGrade(67)
    generateGrade(55)
    generateGrade(39)
    generateGrade(78)
}

fun generateGrade(mark:Int)
{
    when(mark){
        in 0..44 ->println("f")
        in 45..64 ->println("c")
        in 65..74 ->println("b")
        in 75..100 ->println("A")
    else -> ("Error")
    }
}