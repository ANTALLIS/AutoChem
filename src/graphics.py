import pygame
from pygame.locals import *
import time
import random

pygame.init()

width = 800
height = 600 
main_display = pygame.display.set_mode((width, height), pygame.RESIZABLE)
caption = pygame.display.set_caption('AutoChem')

icon = pygame.image.load('Assets\icon.png')

black = (0,0,0)



pygame.display.set_icon(icon)

background = pygame.image.load('Assets\Placeholder.png')

clock = pygame.time.Clock()

FPS = 30

def user_interface(background):
	exiti = False
	while not exiti:
		size = main_display.get_size()
		background = pygame.transform.scale(background, (size))
		
		main_display.blit(background, (0, 0))
	
		pygame.display.update()
		clock.tick(FPS)

		for event in pygame.event.get():
			if event.type == QUIT:
				exiti = True
			if event.type == pygame.KEYDOWN:
				if event.key == K_q:
					exiti = True
			
		pygame.draw.rect(main_display, black, (450,500, 50,100))
					
	pygame.quit()
	quit()

user_interface(background)