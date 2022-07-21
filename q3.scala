def calculateVolume(radius:Double, pi:Double):Double={
    return  4 * pi * radius * radius * radius / 3
}

def main(args:Array[String])={  
    var pi:Double = 3.14
    var radius:Double = 5
        
    println("Volume of sphere: " + calculateVolume(radius, pi))
}