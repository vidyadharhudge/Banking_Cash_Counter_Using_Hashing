package com.Banking_Cash_Counter_Using_Hashing;

public class Banking implements bank
{
    ///user deposit cash
    // How much money  added by user it get depoisted to user balance
    public int depositCash(int cash, int ubalance)
    {

        ubalance += cash;
        return ubalance;
    }
    ///user withdraw cash methode
    // if balance lesss than o it show insufficent balance
    //  how much cash it withdrawl it remove from balance
    public int withdrawCash(int cash, int ubalance)
    {
        if (ubalance <= 0)
        {
            System.out.println("cash is not available");
            return 0;
        }
        else
        {
            ubalance -= cash;
            return ubalance;
        }
    }

}
