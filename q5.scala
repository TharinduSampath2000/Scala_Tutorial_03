def easyPaceTime(distance:Double):Double={
    return 8 * distance
}

def tempoTime(distance:Double):Double={
    return 7 * distance
}

def totalTime(distance1:Double, distance2:Double):Double={
    return easyPaceTime(distance1)+tempoTime(distance2)
}

def main(args:Array[String])={           
    println("Total time taken: "+totalTime((2+2),3))
}