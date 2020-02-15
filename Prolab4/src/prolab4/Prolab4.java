package prolab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;



public class Prolab4 
{
    public static void yenile(Dosyalar okuma){
                    //////////////////////// MAX HEAP AGACLARI OLUSTURULDU////////////////////////////////////////////////
for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++)
   {
       
       okuma.ilk.yemek.altKategori.get(i).AgacOlustur(okuma.bilgiler);
       okuma.ilk.yemek.altKategori.get(i).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data;
       okuma.ilk.yemek.altKategori.get(i).Derinlik = 1;
   }
   
    for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
           
            okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).AgacOlustur(okuma.bilgiler);
             okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data;
             okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).Derinlik = 2;
            }
    }
    
         for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
            
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {     
    
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).AgacOlustur(okuma.bilgiler);
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data+
     ":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data;
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).Derinlik = 3;
                }
            }
         }
         
       
        for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {   
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {      
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).AgacOlustur(okuma.bilgiler);
                    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data+
                             ":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data+":"
                              +okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data;
                   okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).Derinlik = 4;
                    
                    
                    }
                }
  
            }
        }
//////////////////////// MAX HEAP AGACLARI OLUSTURULDU//////////////////////////////////////////////// 
    }
      public static void Gezinme(String c,Dosyalar okuma)
         {
             if(okuma.ilk.yemek.data.equals(c)){
                    okuma.ilk.yemek.AgacOlustur(okuma.bilgiler);
                    okuma.ilk.yemek.KategoriYolu = okuma.ilk.yemek.data;
                    okuma.ilk.yemek.Derinlik = 0;
             }
             //////////////////////// MAX HEAP AGACLARI OLUSTURULDU////////////////////////////////////////////////

for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++)
   {
       if(okuma.ilk.yemek.altKategori.get(i).data.equals(c)){
       okuma.ilk.yemek.altKategori.get(i).AgacOlustur(okuma.bilgiler);
       okuma.ilk.yemek.altKategori.get(i).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data;
       okuma.ilk.yemek.altKategori.get(i).Derinlik = 1;
       }
     
   }
   
    for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
           if( okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(c)){
            okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).AgacOlustur(okuma.bilgiler);
             okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data;
             okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).Derinlik = 2;
           }
           
            }
    }
    
         for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
            
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {     
    if(okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(c)){
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).AgacOlustur(okuma.bilgiler);
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data+
     ":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data;
    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).Derinlik = 3;
    }
  
                }
            }
         }
         
       
        for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {   
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {      
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
                        if(okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(c)){
                            okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).AgacOlustur(okuma.bilgiler);
                    okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).KategoriYolu = okuma.ilk.yemek.altKategori.get(i).data+":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data+
                             ":"+okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data+":"
                              +okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data;
                   okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).Derinlik = 4;
                        }
    
                    
                    
                    }
                }
  
            }
        }
//////////////////////// MAX HEAP AGACLARI OLUSTURULDU////////////////////////////////////////////////       
         }
      
      
       public static void bul(String kategori,Dosyalar okuma)
      {
         if(okuma.ilk.yemek.data.equals(kategori)){
         okuma.ilk.yemek.agac.kok=null;
          okuma.ilk.yemek.KullaniciSayisi=0;
          okuma.ilk.yemek.RezervasyonSayisi=0;
         }
          for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++)
   {
      if(okuma.ilk.yemek.altKategori.get(i).data.equals(kategori)){
          okuma.ilk.yemek.altKategori.get(i).agac.kok=null;
          okuma.ilk.yemek.altKategori.get(i).KullaniciSayisi=0;
          okuma.ilk.yemek.altKategori.get(i).RezervasyonSayisi=0;
      }
   }
   
    for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
           
           if(okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).data.equals(kategori))
           {
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).agac.kok=null;
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).KullaniciSayisi=0;
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).RezervasyonSayisi=0;
           }
            }
    }
    
         for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {
           
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {
            
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {     
    
     if(okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).data.equals(kategori)){
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).agac.kok=null;
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).KullaniciSayisi=0;
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).RezervasyonSayisi=0;
          
      }
                }
            }
         }
         
       
        for (int i = 0; i < okuma.ilk.yemek.altKategori.size(); i++) {   
            for (int j = 0; j < okuma.ilk.yemek.altKategori.get(i).altKategori.size() ; j++) {      
                for (int k = 0; k < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.size(); k++) {
                    for (int l = 0; l < okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.size(); l++) {
     if(okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).data.equals(kategori)){
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).agac.kok=null;
      okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).KullaniciSayisi=0;
          okuma.ilk.yemek.altKategori.get(i).altKategori.get(j).altKategori.get(k).altKategori.get(l).RezervasyonSayisi=0;
      }
                    
                    
                    }
                }
  
            }
        }
          
          
          
      }
   public static void DosyaIslemleri(String yer) throws IOException
   {
       int c = 1;
       File file = new File("dosya.txt");
       BufferedReader reader = null;
       reader= new BufferedReader(new FileReader(file));
       String satir = reader.readLine();
            while(satir!=null)
            {
            String ayir[];
            ayir = satir.split(",");
            if(yer.equals(ayir[1].toString()))
            {
                System.out.println((c++)+"-)"+ayir[0]);
            }
            
             satir = reader.readLine();
            }
   }
   
   public static void TumunuListele(String yer) throws FileNotFoundException, IOException
   {
      int c=1;
      File file = new File("dosya.txt");
      BufferedReader reader = null;
       reader= new BufferedReader(new FileReader(file));
       String satir = reader.readLine();
            while(satir!=null)
            {
            String ayir[];
            ayir = satir.split(",");
            
            if(yer.equals(ayir[0].toString()))
            {
                
           System.out.println((c++)+"-)"+ayir[1]+" "+ayir[2]+" "+ayir[3]+" "+ayir[4]+" "+ayir[5]);
            }
            
             satir = reader.readLine();
            }
   }
       
      
     
    public static void main(String[] args) throws IOException  
    {
        
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        Dosyalar okuma = new Dosyalar();
        okuma.oku();     
        MaxHeap yeni = new MaxHeap();
        yeni.kok = yeni.ekle(okuma.bilgiler.get(0), yeni.kok);  
        yenile(okuma);
   while(true)
    {
        int secim;
        System.out.println("Yapmak istediginiz islemi seciniz:");
        System.out.println("Kategori bulmak icin 1:");
        System.out.println("Yeni kategori eklemek icin 2:");
        System.out.println("Kategori silmek icin 3:");
        System.out.println("Kullanici eklemek icin 4:");
        System.out.println("Kullanici silmek icin 5:");
        System.out.println("Kullaniciya göre kategori listelemek icin 6:");
        System.out.println("Kategoriye göre kullanici listelemek icin 7:");
        System.out.println("Rezervasyon yerine göre kullanici listelemek icin 8:");
        System.out.println("Kullaniciya göre rezervasyon listelemek icin 9:");
        System.out.print("Tuslayiniz:");
       Scanner scan17 = new Scanner(System.in);
       secim =  scan17.nextInt();
      
       switch (secim)
       {
         case 1:   
         int secim2;
         Scanner scan13 = new Scanner(System.in);
         System.out.println("Hangi kategoriyi ariyorsunuz:");    
         String git =  scan1.next();
         bul(git,okuma);
         Gezinme(git,okuma);
         okuma.ara(git);
         System.out.println("Kategori eklemek icin 1'i, Silmek icin 2'i tuslayiniz:");
         System.out.println("Islem yapmak istemiyorsaniz 0'i tuslayiniz!");
         secim2 = scan13.nextInt();
      
         if(secim2 == 1)
         {
             okuma.ekle(git);
             bul(git ,okuma);
             Gezinme(git,okuma);
         }
         else if(secim2 == 2)
         {
               
              okuma.sil(git);
              bul(git,okuma);
         }
         else
         {
             break;
         }
          break;  
          case 2:  
             okuma.ekle();  
             bul(okuma.sozce, okuma);
             Gezinme(okuma.sozce,okuma);   
               
               
          break;
          
         case 3:
         okuma.sil();
         bul(okuma.gonder, okuma); 
         Gezinme(okuma.gonder,okuma);
         break;
          
     case 4:
         int gecici=0;
      System.out.println("Hangi kategoriye kullanici eklenecek:"); 
      String kategori =  scan2.next();
      System.out.println("Kullanici bilgi satirini giriniz:");
      String bilgi = scan3.next();
      String ayir[];
      ayir = bilgi.split(",");
       for (int i = 0; i < okuma.bilgiler.size(); i++)
       {
        if(okuma.bilgiler.get(i).ad.equals(ayir[0].toString()) && okuma.bilgiler.get(i).kategori.equals(kategori))
        {
        gecici=1;
        System.out.println("Bu kategoride ayni id'ye ait baska bir kullanici bulundu!");
        System.out.println("Islem iptal ediliyor!");
        System.out.println();
        System.out.println();
        break;
       
        }
        }
       if(gecici==0){
            Musteri yeni2=new Musteri();
            yeni2.ad=ayir[0];
            yeni2.kategori=kategori;
            yeni2.rezervasyonsayi=1;
            okuma.bilgiler.add(yeni2);
            bul(kategori,okuma);
            Gezinme(kategori,okuma);
       }
     
       break;
       case 5:
           Scanner scan5 = new Scanner(System.in);
           Scanner scan6 = new Scanner(System.in);
           Scanner scan7 = new Scanner(System.in);
           System.out.println("Hangi durumda silme yapmak istiyorsunuz?"); 
           System.out.println("Bir kategori altindaki tum kullanicilari silmek icin:1");
           System.out.println("Belli bir kategori altindaki belli bir kullanici silmek icin:2");
           System.out.println("Bir kullanicinin tum kategorilerdeki kayitlarini silmek icin:3");
           System.out.print("Tuslayiniz:"); 
          int secim3 = scan5.nextInt();
          if(secim3 == 1)
          {
              System.out.println("Hangi kategoriden silmek istiyorsunuz:");  
              String sil = scan6.next();
              for (int i = 0; i < okuma.bilgiler.size(); i++) 
              {
                 if(okuma.bilgiler.get(i).kategori.equals(sil)) 
                 {
                     okuma.bilgiler.remove(i);
                     bul(sil,okuma);
                 }
                  
              }                    
          }
          else if (secim3 == 2)
          {
              System.out.println("Hangi kategoriden silmek istiyorsunuz:");  
              String sil = scan6.next();
              System.out.println("Hangi id'deki kullaniciyi silmek istiyorsunuz:");
              String kullanici = scan7.next();
              for (int i = 0; i < okuma.bilgiler.size(); i++) 
              {
                 if(okuma.bilgiler.get(i).kategori.equals(sil) && okuma.bilgiler.get(i).ad.equals(kullanici)) 
                 {
                    okuma.bilgiler.remove(i);
                    bul(sil,okuma);
                 }         
              }              
          }
          
          else if(secim3 == 3)
          {
             System.out.println("Hangi kullaniciyi silmek istiyorsunuz:");  
              String sil = scan6.next();
              for (int i = 0; i < okuma.bilgiler.size(); i++) 
              {
                 if(okuma.bilgiler.get(i).ad.equals(sil)) 
                 {
                     okuma.bilgiler.remove(i);
                     bul(okuma.bilgiler.get(i).kategori,okuma);
                             
                 }
                  
              }  
          }
            break;
            case 6:
           Scanner scan8 = new Scanner(System.in);
         System.out.println("Hangi kullanicinin rezervasyonlarini listelemek istiyorsunuz:");
         String listele = scan8.next();
         int a = 0;
                for (int i = 0; i < okuma.bilgiler.size(); i++) {
                    if(okuma.bilgiler.get(i).ad.equals(listele))
                    {
                    System.out.println((a++)+"-)"+okuma.bilgiler.get(i).kategori);
                    }   
                }
           
           break;
          case 7:
          Scanner scan9 = new Scanner(System.in);
         System.out.println("Hangi kategorideki kullanicilari listelemek istiyorsunuz:");
         String listele2 = scan9.next();
         int b = 0;
         for (int i = 0; i < okuma.bilgiler.size(); i++) {
                    if(okuma.bilgiler.get(i).kategori.equals(listele2))
                    {
                    System.out.println((b++)+"-)"+okuma.bilgiler.get(i).ad);
                    }   
                }
            break;
            
          case 8:
        Scanner scan10 = new Scanner(System.in);
        System.out.println("Hangi yerdeki kullanicilari listelemek istiyorsunuz:");
        String listele3 = scan10.next();
        DosyaIslemleri(listele3);
       break;
       case 9:     
       Scanner scan11 = new Scanner(System.in);
       System.out.println("Hangi kullaniciya ait rezervasyonlari listelemek istiyorsunuz:");
       String son = scan11.next();
       TumunuListele(son);
       break;      
       }
     
     
       
       System.out.println("Devam etmek icin 1'i tuslayiniz:");
       Scanner scan4 = new Scanner(System.in);
       int secim2 = scan4.nextInt();
       if(secim2!= 1)
       break;
    
    }
   
 //413 MB;
    }    
}
      