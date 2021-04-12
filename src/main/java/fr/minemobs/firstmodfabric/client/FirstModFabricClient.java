package fr.minemobs.firstmodfabric.client;

import de.guntram.mcmod.crowdintranslate.CrowdinTranslate;
import fr.minemobs.firstmodfabric.FirstModFabric;
import net.fabricmc.api.ClientModInitializer;

public class FirstModFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        CrowdinTranslate.downloadTranslations(FirstModFabric.MOD_ID);
    }
}
