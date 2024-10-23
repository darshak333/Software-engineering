
package softwarefinal;

import java.util.ArrayList;

public class Remark {
    private ArrayList<String> postRemarks = new ArrayList<>();
    private String[] remarkTypes = {"Client", "Optometrist"};

    public boolean addRemark(String remark, String category) {
        // Validate the remark length and ensure the first word starts with an uppercase letter
        String[] words = remark.split("\\s+");
        if (words.length < 6 || words.length > 20 || !Character.isUpperCase(remark.charAt(0))) {
            return false; // Fails if there are less than 6 words or more than 20 words, or if the first letter isn't uppercase
        }

        // Validate the category (must be either "Client" or "Optometrist")
        if (!category.equalsIgnoreCase("Client") && !category.equalsIgnoreCase("Optometrist")) {
            return false; // Fails if category is not "Client" or "Optometrist"
        }

        // Check if the maximum of 2 remarks has been reached
        if (postRemarks.size() >= 2) {
            return false; // Fails if there are already 2 remarks
        }

        // Simulate writing the remark by printing it to the console (for online platforms)
        System.out.println("Simulated Remark Entry:");
        System.out.println("Remark: " + remark);
        System.out.println("Category: " + category);
        System.out.println("--------------------");

        // Add the remark to the list of remarks
        postRemarks.add(remark);
        return true; // Successfully added remark
    }

    public static void main(String[] args) {
        // Example usage of addRemark method
        Remark remarkSystem = new Remark();  // Changed from Prescription to Remark

        // Test cases to validate the implementation
        boolean remark1 = remarkSystem.addRemark("The optometrist was very professional and informative during the visit.", "Client");
        System.out.println(remark1 ? "Remark 1 added successfully." : "Failed to add Remark 1.");

        boolean remark2 = remarkSystem.addRemark("Optometrist was very professional and informative during the appointment.", "Optometrist");
        System.out.println(remark2 ? "Remark 2 added successfully." : "Failed to add Remark 2.");

        // This should fail because the prescription already has 2 remarks
        boolean remark3 = remarkSystem.addRemark("Great service, would recommend to everyone.", "Client");
        System.out.println(remark3 ? "Remark 3 added successfully." : "Failed to add Remark 3.");
    }
}