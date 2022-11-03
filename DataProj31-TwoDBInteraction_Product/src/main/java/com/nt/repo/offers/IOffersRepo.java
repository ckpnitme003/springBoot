package com.nt.repo.offers;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.offers.Offers;

public interface IOffersRepo extends JpaRepository<Offers, Integer> {

}
