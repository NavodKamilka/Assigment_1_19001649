object convert extends App{


  def CelsiusToFahrenheit(CelsiusTemp : Double) : Double ={
    CelsiusTemp*1.8000 + 32.00
  }

  println("35 Celsius Convert to Fahrenheit : " + CelsiusToFahrenheit(35))
}
