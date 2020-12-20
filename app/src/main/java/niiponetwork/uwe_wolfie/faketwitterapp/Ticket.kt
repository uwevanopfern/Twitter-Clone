package niiponetwork.uwe_wolfie.faketwitterapp

/**
 * Created by UWE_WOLFIE on 12/4/2017.
 */

class  Ticket{
    var tweetID:String?=null
    var tweetText:String?=null
    var tweetImageURL:String?=null
    var tweetPersonUID:String?=null

    constructor(tweetID:String,tweetText:String,tweetImageURL:String,tweetPersonUID:String){
        this.tweetID=tweetID
        this.tweetText=tweetText
        this.tweetImageURL=tweetImageURL
        this.tweetPersonUID=tweetPersonUID
    }
}