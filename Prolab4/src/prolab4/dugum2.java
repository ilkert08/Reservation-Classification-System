
package prolab4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class dugum2 {
    dugum2 right;
    dugum2 left;
    dugum2 prev;
    Musteri data = new Musteri();
    dugum3 ilk;
    dugum3 son;
    public dugum2()
    {     
       this.right = null;
       this.left = null;
       this.prev = null;
       this.ilk = null;
       this.son = null;
    }
    
    public void LinkedList() throws IOException
    {
       File file = new File("dosya.txt");
       BufferedReader reader = null;
       reader= new BufferedReader(new FileReader(file));
       String satir = reader.readLine();
            while(satir!=null)
            {
            String ayir[];
            String ayir2[];
            ayir = satir.split(",");
            ayir2 = ayir[6].toString().split(":");
                  
            if(this.data.ad.equals(ayir[0]) && this.data.kategori.equals(ayir2[ayir2.length-1]))
            {
                   dugum3  yeni = new dugum3();
                   yeni.YerId = ayir[1];
                   yeni.time = ayir[2];
                   yeni.Enlem= ayir [3];
                   yeni.Boylam = ayir[4];
                   yeni.Sehir = ayir[5];
                if(this.ilk == null)
                {
                    ilk = yeni;
                    son = yeni;
                    son.next = null;
                 }
                else
                {
                    son.next = yeni;
                    son = yeni;
                    son.next = null;
                 }
                
               
            }
         
               satir = reader.readLine();
            }

    
}

}