package lk.ijse.dep.pharmacy.dto;

public class PrescriptionDetailDTO {
    private String code;
    private int qty;
    private double unitPrice;

    public PrescriptionDetailDTO() {
    }

    public PrescriptionDetailDTO(String code, int qty, double unitPrice) {
        this.code = code;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }



    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "PrescriptionDetailDTO{" +
                "code='" + code + '\'' +
                ", qty=" + qty +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
