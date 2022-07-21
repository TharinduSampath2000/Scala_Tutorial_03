def calculateArea(radius:Double, pi:Double):Double={
    return  pi * radius * radius
}

def main(args:Array[String])={  
    var pi:Double = 3.14
    var radius:Double = 5
        
    println("Area of circle: " + calculateArea(radius, pi))
}