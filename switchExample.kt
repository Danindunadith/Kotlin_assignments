fun main(){

    val mark=67

    when(mark)
    {
        in 0..44 ->println("F")
        in 45..64 ->println("C")
        in 65..74 ->println("B")
        in 75..100 ->println("A")
     else ->
     {
         println("error")
     }
    }
}