
package prolab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Dosyalar {
    KategoriAgaci ilk= new KategoriAgaci("rezervasyon");  
    int tut=0;
    String ayir[];
    String katAyir[]= new String[3];
    ArrayList<Musteri> bilgiler=new ArrayList<>();
    String sozce;
    String gonder;
    public Dosyalar()
    {
        katAyir[0]=null;
        katAyir[1]=null;
        katAyir[2]=null;
 
    }
    
    public void oku() throws FileNotFoundException, IOException
    { 
        File file = new File("dosya.txt");
        BufferedReader reader = null;
        reader= new BufferedReader(new FileReader(file));
        String satir = reader.readLine();
        
            while(satir!=null)
            {
              String t;
              ayir=satir.split(",");
              t = ayir[6];
             katAyir = t.split(":");
             if(katAyir.length==1)
             {
                 int gecici5=0;
                 for (int i = 0; i < bilgiler.size(); i++) {
                     if(bilgiler.get(i).ad.equals(ayir[0])&&bilgiler.get(i).kategori.equals(katAyir[0])){
                         bilgiler.get(i).rezervasyonsayi++;
                         gecici5=1;
                     }
                     
                 }
                 if(gecici5==0){
                      Musteri gec=new Musteri(ayir[0],katAyir[0]);
                      bilgiler.add(gec);
                      bilgiler.get(bilgiler.size()-1).rezervasyonsayi++;
                 }
                 else {
                     gecici5=0;
                 }
                
                 if(ilk.yemek.altKategori.size()==0){
                      ilk.yemek.ekle(katAyir[0]); 
                 }
                 int gecici=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                    if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                        gecici=1;
                    }
                     
                 }
                 if(gecici==0)
                 {
                     ilk.yemek.ekle(katAyir[0]);
                 }
                 else gecici=0;
           
              /*   //kategoriler.add(katAyir[0]);
                  kategoriler.add(katAyir[0]);
                ikinciListe.add(null);
                ucuncuListe.add(null);
                dorduncuListe.add(null);*/
             }
              if(katAyir.length==2)
             {
                 int gecici5=0;
                 for (int i = 0; i < bilgiler.size(); i++) {
                     if(bilgiler.get(i).ad.equals(ayir[0])&&bilgiler.get(i).kategori.equals(katAyir[1])){
                         bilgiler.get(i).rezervasyonsayi++;
                         gecici5=1;
                     }
                     
                 }
                 if(gecici5==0){
                      Musteri gec=new Musteri(ayir[0],katAyir[1]);
                      bilgiler.add(gec);
                      bilgiler.get(bilgiler.size()-1).rezervasyonsayi++;
                 }
                 else {
                     gecici5=0;
                 }
                 
                 
                   if(ilk.yemek.altKategori.size()==0){
                      ilk.yemek.ekle(katAyir[0]); 
                 }
                 int gecici=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                    if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                        gecici=1;
                    }
                     
                 }
                 if(gecici==0)
                 {
                     ilk.yemek.ekle(katAyir[0]);
                 }
                 else gecici=0;
                 int gecici1=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0]))
                     {
                         if(ilk.yemek.altKategori.get(i).altKategori.size()==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                            if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                gecici1=1;
                            }
                             
                         }
                         if(gecici1==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         else gecici1=0;
                     }
                 }
               
             
             }
               if(katAyir.length==3)    
             {
                 int gecici5=0;
                 for (int i = 0; i < bilgiler.size(); i++) {
                     if(bilgiler.get(i).ad.equals(ayir[0])&&bilgiler.get(i).kategori.equals(katAyir[2])){
                         bilgiler.get(i).rezervasyonsayi++;
                         gecici5=1;
                     }
                     
                 }
                 if(gecici5==0){
                      Musteri gec=new Musteri(ayir[0],katAyir[2]);
                      bilgiler.add(gec);
                      bilgiler.get(bilgiler.size()-1).rezervasyonsayi++;
                 }
                 else {
                     gecici5=0;
                 }
                 
                 
                 
                 
                  if(ilk.yemek.altKategori.size()==0){
                      ilk.yemek.ekle(katAyir[0]); 
                 }
                 int gecici=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                    if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                        gecici=1;
                    }
                     
                 }
                 if(gecici==0)
                 {
                     ilk.yemek.ekle(katAyir[0]);
                 }
                 else gecici=0;
                 int gecici1=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0]))
                     {
                         if(ilk.yemek.altKategori.get(i).altKategori.size()==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                            if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                gecici1=1;
                            }
                             
                         }
                         if(gecici1==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         else gecici1=0;
                     }
                 }
                    int gecici2=0;
                   
                  for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                     if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                         for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                             if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                 if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size()==0){
                                     ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(katAyir[2]);
                                   
                                 }
                                 for (int k = 0; k <ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size() ; k++) {
                                     if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(katAyir[2])){
                                         gecici2=1;
                                     }
                                     
                                 }
                                 if(gecici2==0){
                                      ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(katAyir[2]);
                                 }
                                 else gecici2=0;
                             }
                             
                         }
                     }
                     
                 }
            
             }
             if(katAyir.length==4)
             {
                 
                 int gecici5=0;
                 for (int i = 0; i < bilgiler.size(); i++) {
                     if(bilgiler.get(i).ad.equals(ayir[0])&&bilgiler.get(i).kategori.equals(katAyir[3])){
                         bilgiler.get(i).rezervasyonsayi++;
                         gecici5=1;
                     }
                     
                 }
                 if(gecici5==0){
                      Musteri gec=new Musteri(ayir[0],katAyir[3]);
                      bilgiler.add(gec);
                      bilgiler.get(bilgiler.size()-1).rezervasyonsayi++;
                 }
                 else {
                     gecici5=0;
                 }
                   
                  if(ilk.yemek.altKategori.size()==0){
                      ilk.yemek.ekle(katAyir[0]); 
                 }
                 int gecici=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                    if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                        gecici=1;
                    }
                     
                 }
                 if(gecici==0)
                 {
                     ilk.yemek.ekle(katAyir[0]);
                 }
                 else gecici=0;
                 int gecici1=0;
                 for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0]))
                     {
                         if(ilk.yemek.altKategori.get(i).altKategori.size()==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                            if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                gecici1=1;
                            }
                             
                         }
                         if(gecici1==0){
                             ilk.yemek.altKategori.get(i).ekle(katAyir[1]);
                         }
                         else gecici1=0;
                     }
                 }
                    int gecici2=0;
                   
                  for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                     
                     if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                         for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                             if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                 if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size()==0){
                                     ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(katAyir[2]);
                                   
                                 }
                                 for (int k = 0; k <ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size() ; k++) {
                                     if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(katAyir[2])){
                                         gecici2=1;
                                     }
                                     
                                 }
                                 if(gecici2==0){
                                      ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(katAyir[2]);
                                 }
                                 else gecici2=0;
                             }
                             
                         }
                     }
                     
                 }
                  int gecici3=0;
                  for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                    if(ilk.yemek.altKategori.get(i).data.equals(katAyir[0])){
                        for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                            if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(katAyir[1])){
                                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                                    if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(katAyir[2])){
                                        if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size()==0){
                                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).ekle(katAyir[3]);
                                        }
                                        for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                                            if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(katAyir[3])){
                                                gecici3=1;
                                            }
                                        }
                                        if(gecici3==0){
                                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).ekle(katAyir[4]);
                                        }
                                        else gecici3=0;
                                        
                                        
                                    }
                                    
                                }
                            }
                            
                        }
                    }
                     
                 }
              
             }
      
              satir = reader.readLine();
              
            }

    }
    
    public int search() throws FileNotFoundException, IOException
    {
        File file = new File("dosya.txt");
        BufferedReader reader = null;
        reader= new BufferedReader(new FileReader(file));
        String satir = reader.readLine();
        int gecici=0;
        String Son="";
            while(satir!=null)
            {
                int sonvir=satir.lastIndexOf(",");
                String x= satir.substring(sonvir+1);
                for (int i = 0; i < x.length(); i++) {
                    if(x.charAt(i)==':'){
                        gecici=1;
                    }
                   
                    
                }
                if(gecici==0){
                    Son=x;
                }
                if(gecici!=0){
                     int son=satir.lastIndexOf(":");
                     Son = satir.substring(son+1);
                     gecici=0;
                }
              
                
                for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
                    if(ilk.yemek.altKategori.get(i).data.equals(Son)){     
                        return 0;
                    }
                    else {
                        
                    }
                      for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                   if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(Son)){
                      return 1;
                   }
                    
                          for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                              if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(Son)){            
                                  return 2;
                              }
                              
                              
                              for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size() ; l++) {
                                  if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(Son)){
                                                                    
                                      return 3;
                                  }
                                  
                              }
                          }
                   
                }
                }
              
                satir = reader.readLine();
            }
            return -1;
    }
    
        public void ara(String aranan)
        {
           boolean ccc = false;
           if(ilk.yemek.data.equals(aranan)){
               System.out.println("Bulundu!");
                ccc =true;
                 System.out.println("Kategori yolu:"+ ilk.yemek.KategoriYolu);
                System.out.println("Derinlik:"+ilk.yemek.Derinlik);
                System.out.println("Kullanici sayisi:"+ilk.yemek.KullaniciSayisi);
                System.out.println("Rezervasyon sayisi:"+ilk.yemek.RezervasyonSayisi);
                System.out.println("Alt Kategori sayisi:"+ ilk.yemek.altKategoriSayisi);
           }
            for (int i = 0; i < ilk.yemek.altKategori.size(); i++)
   {
            if(ilk.yemek.altKategori.get(i).data.equals(aranan))
            {
                System.out.println("Bulundu!");
                ccc =true;
                 System.out.println("Kategori yolu:"+ ilk.yemek.altKategori.get(i).KategoriYolu);
                System.out.println("Derinlik:"+ilk.yemek.altKategori.get(i).Derinlik);
                System.out.println("Kullanici sayisi:"+ilk.yemek.altKategori.get(i).KullaniciSayisi);
                System.out.println("Rezervasyon sayisi:"+ilk.yemek.altKategori.get(i).RezervasyonSayisi);
                System.out.println("Alt Kategori sayisi:"+ ilk.yemek.altKategori.get(i).altKategoriSayisi);
            }
       
       
   }
   
    for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
                
             
            if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(aranan))
            {
                System.out.println("Bulundu!");
                ccc =true;
                 System.out.println("Kategori yolu:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).KategoriYolu);
                System.out.println("Derinlik:"+ilk.yemek.altKategori.get(i).altKategori.get(j).Derinlik);
                System.out.println("Kullanici sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).KullaniciSayisi);
                System.out.println("Rezervasyon sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).RezervasyonSayisi);
                System.out.println("Alt Kategori sayisi:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).altKategoriSayisi);
            }
           
            }
    }
    
         for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
            
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {     
       if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(aranan))
            {
                System.out.println("Bulundu!");
                ccc =true;
                 System.out.println("Kategori yolu:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).KategoriYolu);
                System.out.println("Derinlik:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).Derinlik);
                System.out.println("Kullanici sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).KullaniciSayisi);
                System.out.println("Rezervasyon sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).RezervasyonSayisi);
                System.out.println("Alt Kategori sayisi:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategoriSayisi);
            }
                    
                    
                }
            }
         }
         
       
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {   
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {      
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
      if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(aranan))
            {
                System.out.println("Bulundu!");
                ccc =true;
                System.out.println("Kategori yolu:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).KategoriYolu);
                System.out.println("Derinlik:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).Derinlik);
                System.out.println("Kullanici sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).KullaniciSayisi);
                System.out.println("Rezervasyon sayisi:"+ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).RezervasyonSayisi);
                System.out.println("Alt Kategori sayisi:"+ ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).altKategoriSayisi);
            }
                    
                    }
                }
  
            }
        }
        if(ccc  == false)
        {
            System.out.println("Kategori bulunamadi!");
        }
        
        }
 
    public void sil(){
      String kategori;
      String ustkategori;
      Scanner bul=new Scanner(System.in);
      System.out.print("Kategori:");
      kategori=bul.next();
      //Foodsilme
      sozce = kategori;
      boolean ddd = false;
      for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
          if(ilk.yemek.altKategori.get(i).data.equals(kategori)){
              gonder=ilk.yemek.data;
              ilk.yemek.altKategoriSayisi--;
              ddd = true;
              System.out.println("Silindi!");
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  ilk.yemek.altKategoriSayisi++;
                  ilk.yemek.altKategori.add(ilk.yemek.altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j));
              }
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  ilk.yemek.altKategori.get(i).altKategori.remove(j);
              }
              
             
               ilk.yemek.altKategori.get(i).agac = null;
              
              
              ilk.yemek.altKategori.remove(i);
              
          }
          }
          //Americansilme
         
         
            
         for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(kategori)){
                      ddd = true;
                      System.out.println("Silindi!");
                      ilk.yemek.altKategori.get(i).altKategoriSayisi--;
                      gonder=ilk.yemek.altKategori.get(i).data;
                      for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                          ilk.yemek.altKategori.get(i).altKategoriSayisi++;
       ilk.yemek.altKategori.get(i).altKategori.add(ilk.yemek.altKategori.get(i).altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k));
                          
                      }
                      for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                          ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.remove(k);
                          
                      }
                      
                      ilk.yemek.altKategori.get(i).altKategori.get(j).agac = null;
                 
                      ilk.yemek.altKategori.get(i).altKategori.remove(j);
                  }
                  
              }
              
             } 
          
      
      //DonaldTrumpýsilme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(kategori)){
                         ddd = true;
                         ilk.yemek.altKategori.get(i).altKategori.get(j).altKategoriSayisi--;
                      System.out.println("Silindi!");
                        gonder=ilk.yemek.altKategori.get(i).altKategori.get(j).data;
                        for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategoriSayisi++;
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.add(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l));
                            
                        }
                        for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.remove(l);
                            
                        }
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).agac = null;
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.remove(k);
                    }
                    
                }
                
            }
            
        }
        
        //KingAmericasilme
        
        for (int i = 0; i <ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k <ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                        if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(kategori)){
                               ddd = true;
                      ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategoriSayisi--;
                      System.out.println("Silindi!");
                            
                            gonder=ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data;
                           ilk.yemek.altKategori.remove(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).agac);
                        }
                        
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.remove(l); 
                    }
                    
                }
                
            }
            
        }
        if(ddd == false)
        {
            System.out.println("Kategori bulunamadigindan silinemedi!");
        }

    }
    
      public void sil(String yeni2){
      String kategori;
      String ustkategori;
      Scanner bul=new Scanner(System.in);   
      kategori=yeni2;
      boolean ddd = false;
      //Foodsilme
       for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
          if(ilk.yemek.altKategori.get(i).data.equals(kategori)){
                  ddd = true;
                      System.out.println("Silindi!");
              ilk.yemek.altKategoriSayisi--;
              gonder=ilk.yemek.data;
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  ilk.yemek.altKategoriSayisi++;
                  ilk.yemek.altKategori.add(ilk.yemek.altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j));
              }
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  ilk.yemek.altKategori.get(i).altKategori.remove(j);
              }
              
             
               ilk.yemek.altKategori.get(i).agac = null;
              
              
              ilk.yemek.altKategori.remove(i);
              
          }
          }
          //Americansilme
         
         
            
         for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
              for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                  if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(kategori)){
                          ddd = true;
                      System.out.println("Silindi!");
                      ilk.yemek.altKategori.get(i).altKategoriSayisi--;
                      gonder=ilk.yemek.altKategori.get(i).data;
                      for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                          ilk.yemek.altKategori.get(i).altKategoriSayisi++;
       ilk.yemek.altKategori.get(i).altKategori.add(ilk.yemek.altKategori.get(i).altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k));
                          
                      }
                      for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                          ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.remove(k);
                          
                      }
                      
                      ilk.yemek.altKategori.get(i).altKategori.get(j).agac = null;
                 
                      ilk.yemek.altKategori.get(i).altKategori.remove(j);
                  }
                  
              }
              
             } 
          
      
      //DonaldTrumpýsilme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(kategori)){
                      ddd = true;
                      System.out.println("Silindi!");
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategoriSayisi--;
                        gonder=ilk.yemek.altKategori.get(i).altKategori.get(j).data;
                        for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategoriSayisi++;
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.add(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(), ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l));
                            
                        }
                        for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.remove(l);
                            
                        }
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).agac = null;
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.remove(k);
                    }
                    
                }
                
            }
            
        }
        
        //KingAmericasilme
        
        for (int i = 0; i <ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k <ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                        if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(kategori)){
                       ddd = true;
                      System.out.println("Silindi!");
                            ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategoriSayisi--;
                            gonder=ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data;
                           ilk.yemek.altKategori.remove(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).agac);
                        }
                        
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.remove(l); 
                    }
                    
                }
                
            }
            
        }

        if(ddd == false)
        {
            System.out.println("Kategori bulunamadigindan silinemedi!");
        }

    }
    
    
    
    
    
    
    public void ekle()
    {
        String kategori;
        String ustkategori;   
        Scanner ekle=new Scanner(System.in);
        System.out.print("Eklenecek kategoriyi giriniz:");
        kategori=ekle.next();
         sozce = kategori;
        System.out.print("Eklenecek kategroinin ust kategorisini giriniz:");
        ustkategori=ekle.next();
        
        
        //yemeğe ekleme
        if(ustkategori.equals("yemek")){
            ilk.yemek.ekle(kategori);
        }
        //fooda ekleme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            if(ilk.yemek.altKategori.get(i).data.equals(ustkategori)){
                ilk.yemek.altKategori.get(i).ekle(kategori);
            } 
        }
        
        //Americana ekleme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j <ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(ustkategori)){
                    ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(kategori);
                }
                
            }  
        }
        
        //DonaldTrumpa ekleme
        for (int i = 0; i <ilk.yemek.altKategori.size() ; i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(ustkategori)){
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).ekle(kategori);
                    }
                    
                }
            }
            
        }
        
        
    }
    
     public void ekle(String yeni)
    {
        String kategori;
        String ustkategori;
        
        Scanner ekle=new Scanner(System.in);
        System.out.print("Eklenecek kategoriyi giriniz:");
        kategori=ekle.next();
        ustkategori=yeni;
        
        
        //yemeğe ekleme
        if(ustkategori.equals("yemek")){
            ilk.yemek.ekle(kategori);
        }
        //fooda ekleme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            if(ilk.yemek.altKategori.get(i).data.equals(ustkategori)){
                ilk.yemek.altKategori.get(i).ekle(kategori);
            } 
        }
        
        //Americana ekleme
        for (int i = 0; i < ilk.yemek.altKategori.size(); i++) {
            for (int j = 0; j <ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                if(ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(ustkategori)){
                    ilk.yemek.altKategori.get(i).altKategori.get(j).ekle(kategori);
                }
                
            }  
        }
        
        //DonaldTrumpa ekleme
        for (int i = 0; i <ilk.yemek.altKategori.size() ; i++) {
            for (int j = 0; j < ilk.yemek.altKategori.get(i).altKategori.size(); j++) {
                for (int k = 0; k < ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    if(ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(ustkategori)){
                        ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).ekle(kategori);
                    }
                    
                }
            }
            
        }
        
        
    }
}
