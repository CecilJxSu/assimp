/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assimp.importing;

import assimp.components.AiScene;
import assimp.processes.BaseProcess;
import java.util.ArrayList;

/**
 *
 * @author GBarbieri
 */
public class ImporterPimpl {

    /**
     * Format-specific importer worker objects - one for each format we can
     * read.
     */
    public ArrayList<BaseImporter> mImporter;
    /**
     * Post processing steps we can apply at the imported data.
     */
    public ArrayList<BaseProcess> mPostProcessingSteps;
    /**
     * The imported data, if ReadFile() was successful, NULL otherwise.
     */
    public AiScene mScene;
    /**
     * The error description, if there was one.
     */
    public String mErrorString;

    public ImporterPimpl() {

        mImporter = new ArrayList<>();
    }
}
