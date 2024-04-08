/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codes;

/**
 *
 * @author Lenovo
 */
public class Complaint {
    private String id;
    private String compType;
    private String complaint;
    private boolean status;
    private String solution;

    public Complaint(String id, String compType, String complaint, boolean status, String solution) {
        this.id = id;
        this.compType = compType;
        this.complaint = complaint;
        this.status = status;
        this.solution = solution;
    }

    public String getId() {
        return id;
    }

    public String getCompType() {
        return compType;
    }

    public String getComplaint() {
        return complaint;
    }

    public boolean isStatus() {
        return status;
    }

    public String getSolution() {
        return solution;
    }
    
    
}
