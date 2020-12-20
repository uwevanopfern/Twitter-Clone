package niiponetwork.uwe_wolfie.faketwitterapp

/**
 * Created by UWE_WOLFIE on 12/4/2017.
 */
class  PostInfo{
    var UserUID:String?=null
    var text:String?=null
    var postImage:String?=null
    constructor(UserUID:String,text:String,postImage:String){
        this.UserUID=UserUID
        this.text=text
        this.postImage=postImage
    }
}