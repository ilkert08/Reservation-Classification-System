package prolab4;

import java.util.ArrayList;

public class MaxHeap {
   dugum2 kok= new dugum2();
   dugum2 yeni = new dugum2();
    public MaxHeap() 
    {      
       kok.prev = null;  
       kok = null;
    }

   public dugum2 ekle(Musteri data, dugum2 node)
   {
    
     if(node == null)
     {
         
         dugum2 temp = new dugum2();
         temp.data=data;
         temp.left = temp.right=null;
         return temp; 
          
     }
     else 
     {
         
      if(node.left == null)
      { 
      
      if(data.rezervasyonsayi > node.data.rezervasyonsayi)
      { 
          
         dugum2 gecici = new dugum2();  
         gecici.data = node.data;
         node.data = data;       
         node.left = ekle(gecici.data, node.left); 
         node.left.prev = node;
         
     }
      else
      {
         node.left = ekle(data, node.left);
         node.left.prev = node;  
     }
      
      }
      else if(node.right == null && node.left != null)
      {
  
      if(data.rezervasyonsayi > node.data.rezervasyonsayi)
          {
       
          dugum2 gecici = new dugum2();  
          gecici.data = node.data;
          node.data = data;
          node.right = ekle (gecici.data, node.right); 
          node.right.prev = node;   
          }
          else
          {
           node.right = ekle(data, node.right);
           node.right.prev = node; 
          }            
      }  
      
      
     }
     return node;
    } 
   
   
   public void degistir(dugum2 a)
   {   
       while(a.prev != null)
       {
        
           if(a.prev.data.rezervasyonsayi < a.data.rezervasyonsayi)
           { 
               dugum2 gecici = new dugum2();
               gecici.data = a.prev.data;
               a.prev.data = a.data;
               a.data = gecici.data;        
           }
           a = a.prev;
       }
   }
}