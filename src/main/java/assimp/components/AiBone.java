/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assimp.components;

/**
 *
 * @author GBarbieri
 */
public class AiBone {
    
    /**
     * The name of the bone.
     */
    public String mName;
    
    /**
     * The number of vertices affected by this bone
     * 
     * The maximum value for this member is #AI_MAX_BONE_WEIGHTS.
     */
    public int mNumWeights;
    
    /**
     * The vertices affected by this bone.
     */
    public AiVertexWeight[] mWeights;
}
