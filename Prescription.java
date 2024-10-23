package softwarefinal;

import java.util.Date;

public class Prescription {
    private int prescID;
    private String firstName;
    private String lastName;
    private String address;
    private float sphere;
    private float axis;
    private float cylinder;
    private Date examinationDate;
    private String optometrist;

    // Setter methods
    public void setPrescID(int prescID) {
        this.prescID = prescID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSphere(float sphere) {
        this.sphere = sphere;
    }

    public void setAxis(float axis) {
        this.axis = axis;
    }

    public void setCylinder(float cylinder) {
        this.cylinder = cylinder;
    }

    public void setExaminationDate(Date examinationDate) {
        this.examinationDate = examinationDate;
    }

    public void setOptometrist(String optometrist) {
        this.optometrist = optometrist;
    }

    // Method to add a prescription (simulated console output instead of file write)
    public boolean addPrescription() {
        // Validate firstName and lastName
        if (firstName.length() < 4 || firstName.length() > 15) {
            System.out.println("Error: First name must be between 4 and 15 characters.");
            return false;
        }
        if (lastName.length() < 4 || lastName.length() > 15) {
            System.out.println("Error: Last name must be between 4 and 15 characters.");
            return false;
        }

        // Validate address
        if (address.length() < 20) {
            System.out.println("Error: Address must be at least 20 characters.");
            return false;
        }

        // Validate sphere
        if (sphere < -20.00 || sphere > 20.00) {
            System.out.println("Error: Sphere must be between -20.00 and 20.00.");
            return false;
        }

        // Validate cylinder
        if (cylinder < -4.00 || cylinder > 4.00) {
            System.out.println("Error: Cylinder must be between -4.00 and 4.00.");
            return false;
        }

        // Validate axis
        if (axis < 0 || axis > 180) {
            System.out.println("Error: Axis must be between 0 and 180.");
            return false;
        }

        // Validate optometrist name
        if (optometrist.length() < 8 || optometrist.length() > 25) {
            System.out.println("Error: Optometrist name must be between 8 and 25 characters.");
            return false;
        }

        // Simulate writing to a file by printing to console
        System.out.println("Prescription ID: " + prescID);
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Address: " + address);
        System.out.println("Sphere: " + sphere);
        System.out.println("Cylinder: " + cylinder);
        System.out.println("Axis: " + axis);
        System.out.println("Examination Date: " + examinationDate);
        System.out.println("Optometrist: " + optometrist);
        return true;
    }

    // Main method to test the Prescription class
    public static void main(String[] args) {
        Prescription prescription = new Prescription();

        // Setting values
        prescription.setPrescID(101);
        prescription.setFirstName("Darshak");
        prescription.setLastName("bechara");
        prescription.setAddress("123 Long Street, sprigvale south, 3172 Australia");
        prescription.setSphere(-1.25f);
        prescription.setCylinder(-2.00f);
        prescription.setAxis(90);
        prescription.setExaminationDate(new Date());
        prescription.setOptometrist("Dr. het butai");

        // Attempt to add prescription
        if (prescription.addPrescription()) {
            System.out.println("Prescription successfully added.");
        } else {
            System.out.println("Failed to add prescription. Please check input data.");
        }
    }
}
