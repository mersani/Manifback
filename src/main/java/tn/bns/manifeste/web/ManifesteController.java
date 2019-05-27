package tn.bns.manifeste.web;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import tn.bns.manifeste.entities.AppManifeste;
import tn.bns.manifeste.entities.ConnaissementObject;
import tn.bns.manifeste.entities.ManifestObject;
import tn.bns.manifeste.services.IManifeste;


@CrossOrigin("*")
@RestController
@RequestMapping(value = "manifeste", produces = "application/json")
public class ManifesteController {

    private static final Logger logger = LoggerFactory.getLogger(ManifesteController.class);

    @Autowired
    private IManifeste iManifeste;

    @PostMapping("/save")
    public AppManifeste saveManifeste(@RequestBody AppManifeste manifestObject) {
        if (manifestObject == null) {
            System.out.println("null ");

        }
        return iManifeste.saveManifeste(manifestObject);
    }

    @PostMapping("/saveConnaisement")
    public boolean saveConnaissement(@RequestBody ConnaissementObject connaissementObject) {
        return iManifeste.saveConnaissement(connaissementObject);
    }

    @GetMapping("/allManifestes")
    public @ResponseBody
    List<AppManifeste> getAllmanifestes() {
        System.out.println("lalalal controlleur ");
        return iManifeste.getManifeste();
    }

    @DeleteMapping("/delete-by-id/{manId}")
    public void deleteManifeste(@PathVariable(name = "manId") long manId) {
        iManifeste.DeleteManifeste(manId);
    }

    @PutMapping("/update/{manId}")
    public boolean putmanifeste(@PathVariable long manId, @RequestBody AppManifeste appManifeste) {
        iManifeste.updateManifeste(appManifeste, manId);
        return true;
    }

    @GetMapping("/get-one/{manId}")
    public @ResponseBody
    AppManifeste getOneManifeste(@PathVariable(name = "manId") long manId, AppManifeste manifeste) {
        return iManifeste.getOneManifeste(manId);
    }


}
