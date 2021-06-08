package com.example1.anirbandutta.meandmymess;

public class DatabaseAccess {


    String[][] a =
            {{"19BCB0015", "hello", "anirban.dutta2019@vitstudent.ac.in", "F-213", "VEG", "MHPL 1 - VEG MESS (F-BLOCK)", "ANIRBAN DUTTA"},
            {"19BCB0025", "hello2", "kumar.sparsh2019@vitstudent.ac.in", "B-232", "SPECIAL", "PR 2 - SPECIAL MESS (B-ANNEX)", "KUMAR SPARSH"},
            {"19BCB0026", "hello3", "pavan.tejavarma2019@vitstudent.ac.in", "H-338", "VEG", "CRC 1 - VEG MESS (H-BLOCK)", "KALIDINDI PAVAN TEJA VARMA"},
            {"19BCE0634", "hello4", "avnish.tiwari2019@vitstudent.ac.in", "L-351", "PAID", "RRC 5 - FOOD MALL (L-BLOCK)", "AVNISH TIWARI"},
            {"19BCE2636", "hello5", "bipul.baiwar2019@vitstudent.ac.in", "D-521", "SPECIAL", "RRC 4 - SPECIAL MESS (D- ANNEX)", "BIPUL BAINWAR"},
            {"19BCT0210", "hello6", "harsh.gulati2019@vitstudent.ac.in", "F-452", "NON VEG", "AAC 1 - NON VEG MESS (F-BLOCK)", "HARSH GULATI"},
            {"19BCI0108", "hello7", "anish.khanna2019@vitstudent.ac.in", "K-231", "PAID", "ZEN 4 - FOODCY (K-BLOCK)", "ANISH KHANNA"},
            {"19BDS0077", "hello8", "lakshit.kothari2019@vitstudent.ac.in", "P-213", "SPECIAL", "PR 4 - SPECIAL MESS (P-BLOCK)", "LAKSHIT KOTHARI"},
            {"19BDS0071", "hello9", "ishan.tiwari2019@vitstudent.ac.in", "P-513", "NON VEG", "DR 1 - NON VEG (P-BLOCK)", "ISHAN TIWARI"}};

    public String student_name(String user5) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][0].equalsIgnoreCase(user5)) {
                c = a[i][6];
                break;
            }
        }
        return c;
    }

    public String password(String user) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user)) {
                c = a[i][1];
                break;
            }
        }
        return c;
    }

    public String email_id(String user1) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user1)) {
                c = a[i][2];
                break;
            }
        }
        return c;
    }

    public String Room_no(String user2) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user2)) {
                c = a[i][3];
                break;
            }
        }
        return c;
    }

    public String mess_type(String user3) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][j].equalsIgnoreCase(user3)) {
                c = a[i][4];
                break;
            }
        }
        return c;
    }

    public String mess_name(String user4) {
        int j = 0;
        String c = "Not Found";
        for (int i = 0; i < 9; i++) {
            if (a[i][0].equalsIgnoreCase(user4)) {
                c = a[i][5];
                break;
            }
        }
        return c;
    }
    public void changemess(String newmess,String user)
    {
        for(int i=0;i<9;i++) {
            if (a[i][0].equalsIgnoreCase(user)) {
                a[i][5] = newmess;
            }
        }
    }
public int count()
{
    int p=a.length;
    return p;
}
public String getuser(int position)
{
    return a[position][0];
}

}
