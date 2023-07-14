package com.example.kotlinpratm5i11

class Precio {
}

data class Bid(val bidder: String, val amount: Int)

fun auctionPrice(bid: Bid?) {
    val highestBid = bid?.amount ?: 0
    val finalPrice = if (highestBid > 0) highestBid else MINIMUM_PRICE
    println("Final price: $finalPrice")
}

const val MINIMUM_PRICE = 100

fun main() {
    val bid1 = Bid("John", 150)
    val bid2 = Bid("Alice", 200)
    val bid3: Bid? = null

    auctionPrice(bid1)
    auctionPrice(bid2)
    auctionPrice(bid3)
}
