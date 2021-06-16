import sys
import functools


# https://www.reddit.com/r/learnpython/comments/bgcoqj/want_to_know_about_functoolslru_cachenone/
@functools.lru_cache(None)
def cycle(n):
    counter = 1
    while n is not 1:
        counter += 1
        if n % 2 == 1:
            n = 3 * n + 1
        else:
            n = n // 2
    
    return counter


@functools.lru_cache(None)
def max_cycle(x, y):
    x, y = min(x, y), max(x, y)
    return max(cycle(n) for n in range(x, y + 1))


# https://www.geeksforgeeks.org/what-does-the-if-__name__-__main__-do/
if __name__ == '__main__':
    for line in sys.stdin:
        x, y = map(int, line.split()[:2])
        print(x, y, max_cycle(x, y))