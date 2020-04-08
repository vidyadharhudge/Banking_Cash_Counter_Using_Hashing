package com.Banking_Cash_Counter_Using_Hashing;

public class Hashing
{
    //variables
    int size;
    int[] element;
    int hashValue;
    int nextSlot;
    int front;
    //creating the class constructor hashing
    public Hashing(int size)
    {
        this.size=size;
        element=new int[size];
        hashValue=0;
        nextSlot=0;
        front=0;
    }
    ///value%size it assign to hash value
    // if value on index is zero
    // then add value
    // if value is prsent then goes in else
    // if same value prsent on index then replace ths value by new value
    // if value is not same on that index goes in else condition
    // check for next index has value zero
    // if value of index is zero then insert on this option
    // parameter name=value
    public void put(int value)
    {
        hashValue=value%size;
        if (element[hashValue]==0)
        {
            element[hashValue]=value;
        }
        else
        {
            if (element[hashValue]==value)
            {
                element[hashValue]=value;
            }
            else
            {
                nextSlot=(hashValue+1)%size;
                while (element[nextSlot]!=0&&element[nextSlot]!=value)
                {
                    nextSlot=(nextSlot+1)%size;
                }
                if (element[nextSlot]==0)
                {
                    element[nextSlot]=value;

                }
                else
                {
                    element[nextSlot]=value;
                }
            }


        }

    }
    ///here is the remove methode
    // it remove the front element first
    // then it remove second etc
    public void remove()
    {
        int value=element[front];
        this.front=this.front+1;
    }
    //display methode
    public void display()
    {
        for (int i=1;i<size;i++)
        {
            System.out.println(element[i]);
        }
    }
}
