import java.time.LocalDate;

public class TaxPayer {
    private String taxId;           // เลขประจำตัวผู้เสียภาษีอากร 
    private String fullName;        // ชื่อและนามสกุลรวมกัน 
    private LocalDate birthDate;    // วันเดือนปีเกิด
    private int status;         // สถานภาพ (โสด, สมรส, หย่าร้าง, หม้าย)

    public static final int SINGLE = 1;      // โสด 
    public static final int WIDOWED = 2;     // หม้าย (กรณีเคยสมรสแต่คู่สมรสเสียชีวิตก่อนปีภาษี)
    public static final int DECEASED = 3;    // เสียชีวิต (กรณีผู้มีเงินได้ตายระหว่างปีภาษี)
    public static final int DIVORCED = 4;    // หย่า 

    public String getTaxId() {
        return taxId;
    }
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}