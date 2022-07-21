def calculateShippingCost(bookCount:Int):Double=bookCount match{
    case x if x<= 50 => return 3
    case x if x> 50 => return 3+((x-50)*0.75)
}

def calculateDiscount(bookCount:Int, bookPrice:Double):Double={
    if(isBookStore()){
        return 0.4 * bookCount * bookPrice
    }else{
        return 0
    }
}

def isBookStore():Boolean={
    print("Is this order from a bookstore: \n\t1. Yes\n\t2. No\n\n Enter your option: ")
    var option = scala.io.StdIn.readInt()

    if(option==1){
        return true
    }
    false
}

def finalPrice(bookCount:Int, bookPrice:Double):Double={
    return ((bookPrice * bookCount) + calculateShippingCost(bookCount) - calculateDiscount(bookCount, bookPrice)) 
}

def main(args:Array[String])={  
    var bookPrice:Double = 24.95
    var bookCount:Int = 60
        
    println("Total cost: " + finalPrice(bookCount, bookPrice))
}