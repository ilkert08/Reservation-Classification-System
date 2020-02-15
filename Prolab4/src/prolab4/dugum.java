
package prolab4;

import java.util.ArrayList;

public class dugum {
    ArrayList<dugum> altKategori = new ArrayList();
    String data; // Kategorinin ismi
    int altKategoriSayisi;
    int KullaniciSayisi;
    int RezervasyonSayisi;
    String KategoriYolu;
    int Derinlik = 0;
    MaxHeap agac = new MaxHeap(); 
    
    public dugum() 
    {
        altKategoriSayisi = 0;
        KullaniciSayisi=0;
        RezervasyonSayisi=0;
    }

    public dugum(String data)
    {
        this.data = data;    
    }
    
    
    public void ekle(String veri)
    {
        this.altKategori.add(new dugum(veri));
        this.altKategoriSayisi++; 
    }
    
    public void AgacOlustur(ArrayList<Musteri> a)
    {
       int sayac = 0;
       for (int i = 0; i < a.size(); i++) 
        {
      
          if(a.get(i).kategori.equals(this.data))       
          {    this.KullaniciSayisi++;
               this.RezervasyonSayisi+= a.get(i).rezervasyonsayi;
              sayac++;
              if(sayac>=1 && sayac <=3 )
              {
              agac.kok = agac.ekle(a.get(i), agac.kok); 
              agac.degistir(agac.kok);
              
              }
              else if(sayac>3 && sayac < 6 )
              {           
               agac.kok.left = agac.ekle(a.get(i), agac.kok.left);   
               agac.degistir(agac.kok.left);
              }
              
             else if(sayac>=6 && sayac <= 7  )
              {     
                 agac.kok.right = agac.ekle(a.get(i), agac.kok.right);
                 agac.degistir(agac.kok.right);
               }
      
             else if(sayac>=8 && sayac <= 9  )
              {
                 
                  agac.kok.left.left = agac.ekle(a.get(i), agac.kok.left.left);
                  agac.degistir(agac.kok.left.left);
               }
   
                else if(sayac>=10 && sayac <= 11  )
              {
                  
                  agac.kok.left.right = agac.ekle(a.get(i), agac.kok.left.right);
                  agac.degistir(agac.kok.left.right);
                  
              } 
              
                else if(sayac>=12 && sayac <= 13  )
              {
                  
                  agac.kok.right.left = agac.ekle(a.get(i), agac.kok.right.left);
                  agac.degistir(agac.kok.right.left);
                  
              } 
                  else if(sayac>=14 && sayac <= 15  )
              { 
                  agac.kok.right.right = agac.ekle(a.get(i), agac.kok.right.right);
                  agac.degistir(agac.kok.right.right);
                  
              } 
              
                      else if(sayac>=16 && sayac <= 17  )
              { 
                  agac.kok.left.left.left = agac.ekle(a.get(i), agac.kok.left.left.left);
                  agac.degistir(agac.kok.left.left.left);                 
              }
              
            else if(sayac>=18 && sayac <= 19  )
              { 
                  agac.kok.left.left.right = agac.ekle(a.get(i), agac.kok.left.left.right);
                  agac.degistir(agac.kok.left.left.right);                 
              }
              else if(sayac>=20 && sayac <= 21  )
              { 
                  agac.kok.left.right.left = agac.ekle(a.get(i), agac.kok.left.right.left);
                  agac.degistir(agac.kok.left.right.left);                 
              }
              
                else if(sayac>=22 && sayac <= 23  )
              {
              
                  agac.kok.left.right.right = agac.ekle(a.get(i), agac.kok.left.right.right);
                  agac.degistir(agac.kok.left.right.right);                 
              }
                    else if(sayac>=24 && sayac <= 25  )
              {
                  
                  agac.kok.right.left.left = agac.ekle(a.get(i), agac.kok.right.left.left);
                  agac.degistir(agac.kok.right.left.left);                 
              }
              
                      else if(sayac>=26 && sayac <= 27  )
              {
                 
                  agac.kok.right.left.right = agac.ekle(a.get(i), agac.kok.right.left.right);
                  agac.degistir(agac.kok.right.left.right);                 
              }
              
               else if(sayac>=28 && sayac <= 29  )
              {
                 
                  agac.kok.right.right.left = agac.ekle(a.get(i), agac.kok.right.right.left);
                  agac.degistir(agac.kok.right.right.left);                 
              }
                
                 else if(sayac>=30 && sayac <= 31  )
              {
                 
                  agac.kok.right.right.right = agac.ekle(a.get(i), agac.kok.right.right.right);
                  agac.degistir(agac.kok.right.right.right);                 
              }
              
                else if(sayac>=32 && sayac <= 33  )
              {
                 
                  agac.kok.left.left.left.left = agac.ekle(a.get(i),  agac.kok.left.left.left.left);
                  agac.degistir( agac.kok.left.left.left.left);                 
              }
              
                  else if(sayac>=34 && sayac <= 35  )
              {
                 
                  agac.kok.left.left.left.right = agac.ekle(a.get(i),  agac.kok.left.left.left.right);
                  agac.degistir( agac.kok.left.left.left.right);                 
              }
                else if(sayac>=36 && sayac <= 37  )
              {
                 
                  agac.kok.left.left.right.left = agac.ekle(a.get(i), agac.kok.left.left.right.left);
                  agac.degistir(agac.kok.left.left.right.left);                 
              }
              
             else if(sayac>=38 && sayac <= 39  )
              {              
                  agac.kok.left.left.right.right = agac.ekle(a.get(i), agac.kok.left.left.right.right);
                  agac.degistir(agac.kok.left.left.right.right);                 
              }
                   else if(sayac>=40 && sayac <= 41  )
              {              
                  agac.kok.left.right.left.left = agac.ekle(a.get(i), agac.kok.left.right.left.left  );
                  agac.degistir(agac.kok.left.right.left.left);                 
              }
              
          } 
           
        }
       
        
    }   
}
