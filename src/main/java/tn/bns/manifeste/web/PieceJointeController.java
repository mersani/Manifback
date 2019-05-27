package tn.bns.manifeste.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import tn.bns.manifeste.entities.AppPieceJointe;
import tn.bns.manifeste.services.IPieceJointe;

import java.io.IOException;

import org.springframework.http.HttpStatus;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "pieceJointe", produces = "application/json")
public class PieceJointeController {

    @Autowired
    private IPieceJointe iPieceJointe;

    @PostMapping("/save")
    public void savePieceJointe(@RequestBody AppPieceJointe pieceJointe) {
        iPieceJointe.savePieceJointe(pieceJointe);
    }

    @PostMapping(value = "/savefiles")
    @ResponseStatus(HttpStatus.OK)
    public String saveFile(@RequestParam("file") MultipartFile file) throws IOException {
        String fileFolder = "C:\\files";
        String fileName = file.getOriginalFilename();
        byte[] bytes = file.getBytes();
        iPieceJointe.storeFile(fileName, bytes, fileFolder);
return fileName;
    }

    @GetMapping("/all")
    public @ResponseBody List<AppPieceJointe> getAllPiecesJointes() {
        return iPieceJointe.getPieceJointes();
    }
 @GetMapping("/allByTTCode/{ttCode}")
    public @ResponseBody List<AppPieceJointe> getAllPiecesJointesByTTCode(@PathVariable long ttCode) {
        System.out.println("----" +ttCode);
        return iPieceJointe.getAllPiecesJointesByTTCode(ttCode);
    }

    @DeleteMapping("/delete-by-id/{pieceJointeId}")
    public void deletePieceJointe(@PathVariable(name = "pieceJointeId") long pieceJointeId) {
        iPieceJointe.deletePieceJointe(pieceJointeId);
    }

    @PostMapping("/update/{pieceJointeId}")
    public void putPieceJointeId(@PathVariable(name = "pieceJointeId") long pieceJointeId, @RequestBody AppPieceJointe appPieceJointe) {
        iPieceJointe.updatePieceJointe(appPieceJointe, pieceJointeId);
    }
}
