package br.cesul.ex01;

public class ProfessionalContact extends Contact{

    private String company;

    private String commercialPhone;

    private String likedin;

    private String profession;

    private String sector;

    public ProfessionalContact(String name, String phone, String email, String address, String instagram, String company, String comercialPhone, String likedln, String profession, String sector) {
        super(name, phone, email, address, instagram);
        this.company = company;
        this.commercialPhone = comercialPhone;
        this.likedin = likedln;
        this.profession = profession;
        this.sector = sector;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCommercialPhone() {
        return commercialPhone;
    }

    public void setCommercialPhone(String commercialPhone) {
        this.commercialPhone = commercialPhone;
    }

    public String getLikedin() {
        return likedin;
    }

    public void setLikedin(String likedin) {
        this.likedin = likedin;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}
