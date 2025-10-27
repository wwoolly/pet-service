package com.larchflap.pet_service.repositories

import com.larchflap.pet_service.repositories.entities.CatEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface CatsRepository : JpaRepository<CatEntity, UUID> {
  fun findAllByName(name: String): List<CatEntity>
}
