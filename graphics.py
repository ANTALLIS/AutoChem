import pygame
import time
import random

pygame.init()

display_width = 800
display_height = 600 
Main_dispLay = pygame.display.set_mode((display_width,display_height))
caption = pygame.display.set_caption('AutoChem')

icon = pygame.image.load('icon.ico')



pygame.display.set_icon(icon)

background = pygame.image.load('BA.png')

clock = pygame.time.Clock()

FPS = 30

def user_interface(background):
  exiti = False
  while not exiti:
    Main_dispLay.blit(background)
    
    pygame.display.update()
    clock.tick(FPS)
    
    for event in pygame.event.get():
            if event.type == pygame.QUIT:
              exiti = True
                
  pygame.quit()
  quit()

  
