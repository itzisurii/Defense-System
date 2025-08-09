/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package defencesystem;

/**
 *
 * @author saths
 */
public interface DefenceObserver {
    void updateAreaStatus(boolean isCleared);
    void enableButtonsForLevel(int Level);
}
