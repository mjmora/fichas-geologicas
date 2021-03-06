package com.arqapps.ficha_campo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.security.access.prepost.PostFilter;
import org.springframework.security.access.prepost.PreAuthorize;

@RestResource(path = "fichasCampo", rel = "fichasCampo")
public interface FichaCampoRepository extends CrudRepository<FichaCampo, Long> {
    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    @PostFilter("filterObject.user.username == authentication.name or hasRole('ROLE_ADMIN')")
    Iterable<FichaCampo> findAll();

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN') or hasRole('ROLE_USER')")
    @PostFilter("filterObject.user.username == authentication.name or hasRole('ROLE_ADMIN')")
    Iterable<FichaCampo> findAll(Iterable<Long> longs);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN') or @fichaCampoRepository.findOne(#id)?.user?.username == authentication.name")
    void delete(@Param("id") Long id);

    @Override
    @PreAuthorize("hasRole('ROLE_ADMIN') or #fichaCampo.user?.username == authentication.name")
    void delete(@Param("fichaCampo") FichaCampo fichaCampo);
}
