package com.larchflap.pet_service.controllers

import com.larchflap.pet_service.controllers.dto.CreateCatRequest
import com.larchflap.pet_service.controllers.dto.CatResponse
import com.larchflap.pet_service.repositories.CatsRepository
import com.larchflap.pet_service.repositories.entities.CatEntity
import org.springframework.data.repository.findByIdOrNull
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.UUID

@RestController
@RequestMapping("/cats")
class CatController(
  private val catsRepository: CatsRepository,
) {
  @PostMapping
  fun createCat(@RequestBody request: CreateCatRequest): CatResponse {
    val entity = CatEntity(name = request.name)

    val cat = catsRepository.save(entity)

    return cat.toResponse()
  }

  @GetMapping("/{id}")
  fun getCatByName(@PathVariable id: UUID): CatResponse? =
    catsRepository.findByIdOrNull(id)?.toResponse()

  private fun CatEntity.toResponse() = CatResponse(
    id = id!!,
    name = name,
  )
}