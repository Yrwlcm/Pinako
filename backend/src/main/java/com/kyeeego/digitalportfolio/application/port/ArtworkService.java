package com.kyeeego.digitalportfolio.application.port;

import java.security.Principal;
import java.util.List;

import com.kyeeego.digitalportfolio.domain.dto.ArtworkResponse;
import com.kyeeego.digitalportfolio.domain.dto.ArtworkUpdateDto;
import com.kyeeego.digitalportfolio.domain.dto.ArtworkUploadDto;
import com.kyeeego.digitalportfolio.domain.models.Artwork;

public interface ArtworkService {
    List<Artwork> getPage(int page, int n);

    void upload(ArtworkUploadDto body, Principal principal);

    void update(ArtworkUpdateDto body, Principal principal);

    Artwork findById(long id);

    List<Artwork> findByAuthor(long authorId);

    List<Artwork> findByTags(List<String> tags);

    List<Artwork> findByTitleContains(String titleParts);

    ArtworkResponse getWithTags(Artwork artwork);

    void delete(long id);
}
