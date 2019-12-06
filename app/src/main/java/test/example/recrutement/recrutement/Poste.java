package test.example.recrutement.recrutement;

public class Poste {

    private String nomposte;
    private String contexte;
    private String mission;
    private String profilecherche;
    private String img1;
    private String img2;
    private String img3;


    public Poste(String nomposte, String contexte, String mission, String profilecherche, String img1, String img2, String img3) {
        this.nomposte = nomposte;
        this.contexte = contexte;
        this.mission = mission;
        this.profilecherche = profilecherche;
        this.img1 = img1;
        this.img2 = img2;
        this.img3 = img3;
    }

    public String getNomposte() {
        return nomposte;
    }

    public void setNomposte(String nomposte) {
        this.nomposte = nomposte;
    }

    public String getContexte() {
        return contexte;
    }

    public void setContexte(String contexte) {
        this.contexte = contexte;
    }

    public String getMission() {
        return mission;
    }

    public void setMission(String mission) {
        this.mission = mission;
    }

    public String getProfilecherche() {
        return profilecherche;
    }

    public void setProfilecherche(String profilecherche) {
        this.profilecherche = profilecherche;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    public String getImg3() {
        return img3;
    }

    public void setImg3(String img3) {
        this.img3 = img3;
    }
}
