import pygame
import time
import random

pygame.init()

display_width = 800
display_height = 600
mainDisplay = pygame.display.set_mode((display_width,display_height))


#colour
white = (255,255,255)
black = (0,0,0)
green = (69,219,46)
red = (255,0,0)
yellow = (255,255,0)

pygame.display.set_caption('AutoChem')

icn = pygame.image.load('icon.ico')
pygame.display.set_icon(icn)

background = pygame.image.load('Background.png')
clock = pygame.time.Clock()

largefont = pygame.font.SysFont("couriernew", 80)
medfont = pygame.font.SysFont("couriernew", 40)

#buttons
start = pygame.image.load('start.png')
opt = pygame.image.load('options.png')
qui = pygame.image.load('quit.png')


FPS = 15

def button(start,opt,qui):
    #start
    mainDisplay.blit(start,(340,500))
    #quit
    mainDisplay.blit(opt,(600,500))
    #options

    mainDisplay.blit(qui,(65,500))
    
    

def menu(FPS,back):
    game_Exit = False
    while not game_Exit:
        mainDisplay.blit(back,(0,0))
        textsurface = largefont.render('AutoChem', False, white)
        mainDisplay.blit(textsurface,(display_width/2-180,display_height/2-80))
        button(start,opt,qui)
        pygame.display.update()
        clock.tick(FPS)
        
        for event in pygame.event.get():
                if event.type == pygame.QUIT:
                    game_Exit = True
    pygame.quit()
    quit()
                    

menu(FPS,background)
