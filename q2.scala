def toFarenheight(celcius:Double):Double={
    return(celcius * 1.8000 + 32.00)
}

def main(args: Array[String])={
    var celcius:Double = 35

    println("Temperature in farenheight :" + toFarenheight(celcius))
}