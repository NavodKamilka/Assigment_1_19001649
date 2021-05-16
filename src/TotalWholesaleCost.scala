object TotalWholesaleCost extends App{

  def CalWholeSaleCost(copies :Int) : Double ={
    val coverPrice = 24.95
    val discount = 24.95*copies*0.4
    if(copies > 50) (coverPrice*copies) - discount + (50)*3.0 + (copies-50)*0.75
    else (coverPrice*copies) - discount + (copies*3.0)
  }

  println("What is the total wholesale cost for 60 copies : " + CalWholeSaleCost(60))
}
