 package execution1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Execution1 {

    public static void main(String[] args) {
        
        char[] dm = new char[100];
        String[] CS = new String[100];
        int boyut = 0;
        int c=0;
        int bayrak=0;
        Scanner sc = new Scanner(System.in);
        
        int AX = 0,BX = 0,CX=0,DX=0;
        int S=5,Z= 5;
        
        
        System.out.println("Dosya ismini giriniz: ");
        String  dosyaAdi = sc.nextLine();
        

        try {
            BufferedReader dosya = new BufferedReader(new FileReader(dosyaAdi));
            String satir;
            StringBuilder dizi = new StringBuilder();

            int b = 0;
            String kar = "";

            while ((satir = dosya.readLine()) != null) {
                for (int i = 0; i < satir.length(); i++) {
                    char karakter = satir.charAt(i);
                    if (karakter == ' ' || karakter == ',' || karakter == ';' || karakter == ':' || karakter == 10) {
                        if (boyut > 0) {
                            for (int a = 0; a < boyut; a++) {
                                kar += dm[a];
                                
                            }
                            CS[b++] = kar;
                            boyut = 0;
                            kar = "";
                        }
                    } else {
                        dm[boyut++] = karakter;
                    }
                    
                }
                
                if (boyut > 0) {
                    for (int a = 0; a < boyut; a++) {
                        kar += dm[a];
                    }
                    CS[b++] = kar;
                    boyut = 0;
                    kar = "";
                }
            }

            
            
            
            for(int i=0;i<b;i++){
                //ATAMA
                if(CS[i].equals("HRK")){
                    if(CS[i+1].equals("AX")){
                        if(CS[i+2].equals("BX")){
                            AX=BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=DX;
                        }
                        else{
                            AX=Integer.parseInt(CS[i+2]);
                        }
                    }                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){
                            BX=AX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=DX;
                        }
                        else{
                            BX=Integer.parseInt(CS[i+2]);
                        }
                    }
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){
                            CX=AX;
                        }
                        else if(CS[i+2].equals("BX")){
                            CX=BX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=DX;
                        }
                        else{
                            CX=Integer.parseInt(CS[i+2]);
                        }
                    }
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){
                            DX=AX;
                        }
                        else if(CS[i+2].equals("BX")){
                            DX=BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=CX;
                        }
                        else{
                            DX=Integer.parseInt(CS[i+2]);
                        }
                    }                    
                }
                //TOPLAMA
                else if(CS[i].equals("TOP")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("AX")){                               
                            AX=AX+AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            AX=AX+BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=AX+CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=AX+DX;
                        }
                        else{//sabitle toplanırsa
                            AX=AX+Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){                               
                            BX=BX+AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            BX=BX+BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=BX+CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=BX+DX;
                        }
                        else{//sabitle toplanırsa
                            BX=BX+Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){                               
                            CX=CX+AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            CX=CX+BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            CX=CX+CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=CX+DX;
                        }
                        else{//sabitle toplanırsa
                            CX=CX+Integer.parseInt(CS[i+2]);
                        }   
                    } 
                    
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){                               
                            DX=DX+AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            DX=DX+BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=DX+CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            DX=DX+DX;
                        }
                        else{//sabitle toplanırsa
                            DX=DX+Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                }
                //ÇIKARMA
                else if(CS[i].equals("CIK")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("BX")){  
                            if(AX>BX){
                                S=0;
                                Z=0;
                            }
                            else if(AX==BX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }
                            AX=AX-BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            if(AX>CX){
                                S=0;
                                Z=0;
                            }
                            else if(AX==CX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }
                            AX=AX-CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            if(AX>DX){
                                S=0;
                                Z=0;
                            }
                            else if(AX==DX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            AX=AX-DX;
                        }
                        else{//sabitle toplanırsa
                            if(AX>Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=0;
                            }
                            else if(AX==Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            AX=AX-Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){   
                            if(BX>AX){
                                S=0;
                                Z=0;
                            }
                            else if(BX==AX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            BX=BX-AX;
                        }                        
                        else if(CS[i+2].equals("CX")){
                            if(BX>CX){
                                S=0;
                                Z=0;
                            }
                            else if(BX==CX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            BX=BX-CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            if(BX>DX){
                                S=0;
                                Z=0;
                            }
                            else if(BX==DX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            BX=BX-DX;
                        }
                        else{//sabitle toplanırsa
                            if(BX>Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=0;
                            }
                            else if(BX==Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            BX=BX-Integer.parseInt(CS[i+2]);
                        }   
                    }
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){  
                            if(CX>AX){
                                S=0;
                                Z=0;
                            }
                            else if(CX==AX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            CX=CX-AX;
                        }                        
                        else if(CS[i+2].equals("BX")){  
                            if(CX>BX){
                                S=0;
                                Z=0;
                            }
                            else if(CX==BX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            CX=CX-BX;
                        }
                        else if(CS[i+2].equals("DX")){
                            if(CX>DX){
                                S=0;
                                Z=0;
                            }
                            else if(CX==DX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            CX=CX-DX;
                        }
                        else{//sabitle toplanırsa
                            if(CX>Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=0;
                            }
                            else if(CX==Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            CX=CX-Integer.parseInt(CS[i+2]);
                        }   
                    }                     
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){  
                            if(DX>AX){
                                S=0;
                                Z=0;
                            }
                            else if(DX==AX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            DX=DX-AX;
                        }                        
                        else if(CS[i+2].equals("BX")){    
                            if(DX>BX){
                                S=0;
                                Z=0;
                            }
                            else if(DX==BX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            DX=DX-BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            if(DX>CX){
                                S=0;
                                Z=0;
                            }
                            else if(DX==CX){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            DX=DX-CX;
                        }
                        else{//sabitle toplanırsa
                            if(DX>Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=0;
                            }
                            else if(DX==Integer.parseInt(CS[i+2])){
                                S=0;
                                Z=1;
                            }
                            else{
                                S=1;
                                Z=0;
                            }                            
                            DX=DX-Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                } 
                //ÇARPMA
                else if(CS[i].equals("CRP")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("AX")){                               
                            AX=AX*AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            AX=AX*BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=AX*CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=AX*DX;
                        }
                        else{//sabitle toplanırsa
                            AX=AX*Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){                               
                            BX=BX*AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            BX=BX*BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=BX*CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=BX*DX;
                        }
                        else{//sabitle toplanırsa
                            BX=BX*Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){                               
                            CX=CX*AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            CX=CX*BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            CX=CX*CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=CX*DX;
                        }
                        else{//sabitle toplanırsa
                            CX=CX*Integer.parseInt(CS[i+2]);
                        }   
                    } 
                    
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){                               
                            DX=DX*AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            DX=DX*BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=DX*CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            DX=DX*DX;
                        }
                        else{//sabitle toplanırsa
                            DX=DX*Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                } 
                //BÖLME
                else if(CS[i].equals("BOL")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("AX")){                               
                            AX=AX/AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            AX=AX/BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=AX/CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=AX/DX;
                        }
                        else{//sabitle toplanırsa
                            AX=AX/Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){                               
                            BX=BX/AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            BX=BX/BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=BX/CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=BX/DX;
                        }
                        else{//sabitle toplanırsa
                            BX=BX/Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){                               
                            CX=CX/AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            CX=CX/BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            CX=CX/CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=CX/DX;
                        }
                        else{//sabitle toplanırsa
                            CX=CX/Integer.parseInt(CS[i+2]);
                        }   
                    } 
                    
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){                               
                            DX=DX/AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            DX=DX/BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=DX/CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            DX=DX/DX;
                        }
                        else{//sabitle toplanırsa
                            DX=DX/Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                }
                //VE
                else if(CS[i].equals("VE")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("AX")){                               
                            AX=AX&AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            AX=AX&BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=AX&CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=AX&DX;
                        }
                        else{//sabitle toplanırsa
                            AX=AX&Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){                               
                            BX=BX&AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            BX=BX&BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=BX&CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=BX&DX;
                        }
                        else{//sabitle toplanırsa
                            BX=BX&Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){                               
                            CX=CX&AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            CX=CX&BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            CX=CX&CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=CX&DX;
                        }
                        else{//sabitle toplanırsa
                            CX=CX&Integer.parseInt(CS[i+2]);
                        }   
                    } 
                    
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){                               
                            DX=DX&AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            DX=DX&BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=DX&CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            DX=DX&DX;
                        }
                        else{//sabitle toplanırsa
                            DX=DX&Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                }
                //VEYA
                else if(CS[i].equals("VEY")){
                    if(CS[i+1].equals("AX")){ 
                        if(CS[i+2].equals("AX")){                               
                            AX=AX|AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            AX=AX|BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            AX=AX|CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            AX=AX|DX;
                        }
                        else{//sabitle toplanırsa
                            AX=AX|Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("BX")){
                        if(CS[i+2].equals("AX")){                               
                            BX=BX|AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            BX=BX|BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            BX=BX|CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            BX=BX|DX;
                        }
                        else{//sabitle toplanırsa
                            BX=BX|Integer.parseInt(CS[i+2]);
                        }   
                    }
                    
                    else if(CS[i+1].equals("CX")){
                        if(CS[i+2].equals("AX")){                               
                            CX=CX|AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            CX=CX|BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            CX=CX|CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            CX=CX|DX;
                        }
                        else{//sabitle toplanırsa
                            CX=CX|Integer.parseInt(CS[i+2]);
                        }   
                    } 
                    
                    else if(CS[i+1].equals("DX")){
                        if(CS[i+2].equals("AX")){                               
                            DX=DX|AX;
                        }                        
                        else if(CS[i+2].equals("BX")){                               
                            DX=DX|BX;
                        }
                        else if(CS[i+2].equals("CX")){
                            DX=DX|CX;
                        }
                        else if(CS[i+2].equals("DX")){
                            DX=DX|DX;
                        }
                        else{//sabitle toplanırsa
                            DX=DX|Integer.parseInt(CS[i+2]);
                        }   
                    }                    
                }
                //OKU
                else if(CS[i].equals("OKU")){
                    if(CS[i+1].equals("AX")){
                        System.out.println("AX in degerini girin: ");
                        AX=sc.nextInt();
                    }
                    else if(CS[i+1].equals("BX")){
                        System.out.println("BX in degerini girin: ");
                        BX=sc.nextInt();
                    }
                    else if(CS[i+1].equals("CX")){
                        System.out.println("CX in degerini girin: ");
                        CX=sc.nextInt();
                    }
                    else if(CS[i+1].equals("DX")){
                        System.out.println("DX in degerini girin: ");
                        DX=sc.nextInt();
                    }
                }
                
                
                //YAZ
                else if(CS[i].equals("YAZ")){
                    if(CS[i+1].equals("AX")){
                        System.out.println("AX in degeri: "+AX);
                    }
                    else if(CS[i+1].equals("BX")){
                        System.out.println("BX in degeri: "+BX);
                    }
                    else if(CS[i+1].equals("CX")){
                        System.out.println("CX in degeri: "+CX);
                    }
                    else if(CS[i+1].equals("DX")){
                        System.out.println("DX in degeri: "+DX);
                    }
                    else{
                        System.out.println("Sabitin degeri: "+Integer.parseInt(CS[i+1]));
                    }
                }

                //DEG
                
                else if(CS[i].equals("DEG")){
                    int EX=2147483647;
                    if(CS[i+1].equals("AX")){
                        AX=AX^EX;
                    }
                    else if(CS[i+1].equals("BX")){
                        BX=BX^EX;
                    }
                    else if(CS[i+1].equals("CX")){
                        CX=CX^EX;
                    }
                    else if(CS[i+1].equals("DX")){
                        DX=DX^EX;
                    }
                    else{
                        int k=Integer.parseInt(CS[i+1]);
                        k=k^EX;
                    }
                    
                }
                //DB
                else if(CS[i].equals("DB")){
                    if((S==0) && (Z==0)){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                    }   
                }                
                //DK
                else if(CS[i].equals("DK")){
                    if((S==1) && (Z==0)){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    c=1;
                                    break;
                                }
                            }
                        }
                    }                   
                }
                //DE
                else if(CS[i].equals("DE")){
                    if((S==0) && (Z==1)){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                    }                    
                }
                //DBE
                else if(CS[i].equals("DBE")){
                    if(((S==0) && (Z==0))||((S==0) && (Z==1))){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                    }                    
                }
                //DKE
                else if(CS[i].equals("DKE")){
                    if(((S==1) && (Z==0))||((S==0) && (Z==1))){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                    }                    
                }
                //DED
                else if(CS[i].equals("DED")){
                    if(((S==0) && (Z==0))||((S==1) && (Z==0))){
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                    }                    
                }
                //D
                else if(CS[i].equals("D")){                    
                        if(CS[i+1].equals("ETIKET1")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET1")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET2")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET2")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET3")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET3")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET4")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET4")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET5")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET5")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET6")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET6")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET7")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET7")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET8")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET8")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET9")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET9")){
                                    i=m;
                                    break;
                                }
                            }
                        }
                        else if(CS[i+1].equals("ETIKET10")){
                            int m;
                            for(m=i+2;m<b;m++){
                                if(CS[m].equals("ETIKET10")){
                                    i=m;
                                    break;
                                }
                            }
                        }                                        
                }
                //SON
                else if(CS[i].equals("SON")){
                    System.exit(0);
                }
            }

            dosya.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        

    }

    
}
