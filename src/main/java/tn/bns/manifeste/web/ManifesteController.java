package tn.bns.manifeste.web;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.ConnaissementObject;
import tn.bns.manifeste.entities.ManifestObject;
import tn.bns.manifeste.services.IManifeste;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "manifeste", produces = "application/json")
public class ManifesteController {

    private static final Logger				logger = LoggerFactory.getLogger(ManifesteController.class);

    @Autowired
    private IManifeste iManifeste;

    @PostMapping("/save")
    public boolean saveManifeste(@RequestBody ManifestObject manifestObject) {
        if (manifestObject == null){
            System.out.println("null "  );

        }
        return iManifeste.saveManifeste(manifestObject);
    }
    @PostMapping("/saveConnaisement")
    public boolean saveConnaissement(@RequestBody ConnaissementObject connaissementObject) {
        return iManifeste.saveConnaissement(connaissementObject);
    }

    @GetMapping("/allManifestes")
    public @ResponseBody List<AppManifeste> getAllmanifestes() {
        System.out.println("lalalal controlleur " );
        return iManifeste.getManifeste();
    }

    @DeleteMapping("/delete-by-id/{manId}")
    public void deleteManifeste(@PathVariable(name = "manId") long manId) {
        iManifeste.DeleteManifeste(manId);
    }

    @PostMapping("/update/{manId}")
    public void putmanifeste(@PathVariable(name = "manId") long manId, @RequestBody AppManifeste appManifeste) {
        iManifeste.updateManifeste(appManifeste, manId);

    }

    @GetMapping("/get-one/{manId}")
    public @ResponseBody
    AppManifeste getOneManifeste(@PathVariable(name = "manId") long manId, AppManifeste manifeste) {
        return iManifeste.getOneManifeste(manId);
    }


}
