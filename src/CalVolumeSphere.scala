object CalVolumeSphere extends App{

  def volume(radius : Int) : Double ={
    (4.0/3.0)*math.Pi*(math.pow(radius,3))
  }

  println("What is the volume of a sphere with radius 5 : " + volume(5))
}
