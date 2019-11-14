/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorter;

/**
 *
 * @author 040069
 */
public class SortedList 
{
    private SorteableItem list[];
    private int count;
    
    public SortedList(int capMax)
    {
        list= new SorteableItem[capMax];
        count=0;
    }
    
    public boolean add(SorteableItem item)
    {
        if(count >= list.length)
            return false;
        
        list[count]= item;
        count++;
        return true;
    }
    
    public void sort()
    {
        for (int i=0; i<count-1; i++)
        {
            for(int j=i+1; j<count; j++)
            {
                if(list[i].getInt() > list[j].getInt())
                {
                    SorteableItem tmp= list[i];
                    list[i]=list[j];
                    list[j]= tmp;
                }
            }
        }
    }
    
    public void printList()
    {
        for (int i=0; i <= count - 1; i++)
            list[i].printItem();        
    }
}
