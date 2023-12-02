fun main(){

    calcFuelCost(3,356)
    calcFuelCost(10,270)
}

fun calcFuelCost (qty:Int,price:Int)
{
    val tot:Int=qty*price

    println("Totel cost is $tot")

}